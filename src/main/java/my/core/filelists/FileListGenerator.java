package my.core.filelists;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * User: mtitov
 * Date: 7/11/11
 * Time: 7:40 PM
 */
public class FileListGenerator {
	
	public static void generateFlatList(String path) {
        try {
            generateFile(searchFiles(path, true), false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void generateRandomList(String path) {
        try {
            generateFile(searchFiles(path, false), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void generateList(String path) {
        try {
            List<File> files;
            if (path != null) {
                files = searchFiles(path, false);
            } else {
                files = searchFiles(".", false);
            }
            Collections.shuffle(files);
            System.out.println(files.size() + " files found:");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (File file : files) {
                byteArrayOutputStream.write((file.getAbsolutePath() + "\n").getBytes());
                System.out.println(file.getAbsolutePath());
            }
            byteArrayOutputStream.write((files.size() + " files found").getBytes());
            OutputStream f2 = new FileOutputStream("FileList.txt");
            byteArrayOutputStream.writeTo(f2);
            f2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void generateFile(List<File> files, boolean random){
        try {
            if(random) {
                Collections.shuffle(files);
            }
            System.out.println(files.size() + " files found:");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (File file : files) {
                byteArrayOutputStream.write((file.getAbsolutePath() + "\n").getBytes());
                System.out.println(file.getAbsolutePath());
            }
            byteArrayOutputStream.write((files.size() + " files found").getBytes());
            OutputStream f2 = new FileOutputStream("FileList.txt");
            byteArrayOutputStream.writeTo(f2);
            f2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<File> searchFiles(String path, boolean flat) throws Exception {
        if (path == null) {
            path = ".";
        }
        List<File> result = new ArrayList<File>();
        File folder = new File(path);

        if (folder.isFile()) {
            result.add(folder);
        } else {
            File[] list = folder.listFiles();
            if (list != null) {
                if(flat) {
                    for (File file : list) {
                        result.add(file);
                    }
                } else {
                    for (File aList : list) {
                        List<File> resTmp = searchFiles(aList.getAbsolutePath(), false);
                        for (File aResTmp : resTmp) {
                            result.add(aResTmp);
                        }
                    }
                }
            } else {
                System.out.println("I/O Errors in " + folder.getAbsolutePath());
            }
        }
        return result;
    }

}
