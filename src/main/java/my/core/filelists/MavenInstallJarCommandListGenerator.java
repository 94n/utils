package my.core.filelists;

import java.io.File;
import java.util.List;

/**
 * User: mtitov
 * Date: 3/16/12
 * Time: 1:55 PM
 */
public class MavenInstallJarCommandListGenerator {

    public static void printMavenDependenciesFromJarDirectory() {
        try {
            List<File> allFilesInDirectory = FileListGenerator.searchFiles("D:\\AgileAssets\\ams_dev\\trunk\\WEB-INF\\lib", true);
            for (File file : allFilesInDirectory) {
                final String name = file.getName();
                final int lastIndexOfDot = name.lastIndexOf('.');
                if (lastIndexOfDot != -1) {
                    final String extension = name.substring(lastIndexOfDot + 1);
                    if (extension.equals("jar")) {
                        final String nameWithoutExtension = name.substring(0, lastIndexOfDot);
                        System.out.println("<dependency><groupId>local.dummy</groupId><artifactId>" + nameWithoutExtension + "</artifactId><version>0.0.1</version><scope>system</scope><systemPath>/${project.basedir}/WEB-INF/lib/" + name + "</systemPath></dependency>");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printMavenInstallJarCommandList() {
        try {
            List<File> allFilesInDirectory = FileListGenerator.searchFiles("D:\\AgileAssets\\ams_dev\\trunk\\WEB-INF\\lib", true);
            for (File file : allFilesInDirectory) {
                final String name = file.getName();
                final int lastIndexOfDot = name.lastIndexOf('.');
                if (lastIndexOfDot != -1) {
                    final String extension = name.substring(lastIndexOfDot + 1);
                    if (extension.equals("jar")) {
                        final String nameWithoutExtension = name.substring(0, lastIndexOfDot);
                        System.out.println("mvn install:install-file -Dfile=" + file.getAbsolutePath() + " -DgroupId=localGroup." + name.substring(0, lastIndexOfDot) + " -DartifactId=" + nameWithoutExtension + " -Dpackaging=jar -Dversion=0.0.1");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
