public class URLDecode {

    public static String extractIt(String url)
    {
        // s/r ==split==> {s,r}
        String[] directories = url.split("/");
        // length of {s,r} = 2 then last index is 2 - 1
        String file = directories[directories.length - 1];

        // e.g. *bcdef ==substring(1)==> bcdef
        if(file.startsWith("*"))
        {
            // this will be _bcdef
            file = "_" + file.substring(1);
        }

        return file;
    }

    public static void main(String args[])
    {
        System.out.println(URLDecode.extractIt("http://example.com/files/public_files/test.zip"));
    }

}
