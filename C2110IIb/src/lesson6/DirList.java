/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

import java.io.File;
import java.io.FilenameFiler;
import java.io.FilenameFilter;

/**
 *
 * @author admin
 */
class FileFilter extends FilenameFiler {

    String ext;

    public FileFilter(String ext) {
        this.ext = "." + ext;
    }

    public boolean accept(File dir, String fName) {
        return fName.endsWith(ext);
    }
}

public class DirList {

    public static void main(String[] args) {
        String dirName = "d://resources";
        File fileObj = new File("d:\\resources");
        FilenameFilter filterObj = (FilenameFilter) new FileFilter("java");
        String[] fileName = fileObj.list(filterObj);
        System.out.println("Number of files found:" + fileName.length);
        System.out.println("");
        System.out.println("Names of the files are: ");
        System.out.println("--------------------------");
        for (int ctr = 0; ctr < fileName.length; ctr++) {
            System.out.println(fileName[ctr]);
        }
    }
}