package testpackage;

import testpackage.content.filelists.FileListGenerator;
import testpackage.content.filelists.MavenInstallJarCommandListGenerator;

/**
 * User: mtitov
 * Date: 7/11/11
 * Time: 7:15 PM
 */
public class FileListGeneratorLauncher {

    public static void main(String[] args) {
        FileListGenerator.generateRandomList("F:\\Docs\\Fiction\\Sugarloaf Key");
//        MavenInstallJarCommandListGenerator.printMavenInstallJarCommandList();
    }


}
