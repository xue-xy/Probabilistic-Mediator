package org.fmgroup.mediator.plugin.generator;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class FileSet {
    /**
     * a collection of files that are generated by code generators
     * since in most cases, a code generator generates a set of files instead of only one.
     * e.g. runtime libraries
     * e.g. multiple source codes
     */

    private Map<String, String> contents = new HashMap<>();

    /**
     * add files to this file set
     * @param path is a relative path splitted with '/', which is platform-independent
     * @param content
     */
    public void add(String path, String content) throws FileAlreadyExistsException {
        if (contents.containsKey(path)) {
            throw new FileAlreadyExistsException(path);
        }

        contents.put(path, content);
    }

    public void add(String path, File existingFile) throws IOException {
        String content = "";
        InputStreamReader reader = new InputStreamReader(new FileInputStream(content));
        char [] buffer = new char[(int) existingFile.length()];
        reader.read(buffer);
        add(path, buffer.toString());
    }

    @Override
    public String toString() {
        String rendered = "";

        for (String path : contents.keySet()) {
            rendered += String.format("[ %s ]\n\n", path);
            rendered += contents.get(path) + "\n";
        }

        return rendered;
    }

    public void writeToFileSystem(File rootdir) throws FileNotFoundException {
        if (!rootdir.exists()) throw new FileNotFoundException(rootdir.getPath());
        for (String path : contents.keySet()) {
            File file = Paths.get(rootdir.getPath(), path).toFile();
//            if (file.exists()) throw new FileAlreadyExistsException(path);
            try {
                // todo automatically create folders?
                FileWriter writer = new FileWriter(file);
                writer.write(contents.get(path));
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}