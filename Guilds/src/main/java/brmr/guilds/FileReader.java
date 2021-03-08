package brmr.guilds;
import java.io.*;

public class FileReader extends BaseFileReader {

    private final File _file;
    private final Context _context;

    public FileReader(String path, Context context)
    {
        _file = new File(path);
        _context = context;
    }

    public void Read()
    {
        if (_file.exists())
        {
            try(FileInputStream fin = new FileInputStream(_file.getPath()))
            {
                int i=-1;
                while((i=fin.read())!=-1)
                {
                    Value += (char)i;
                }
                IsCompleted = true;
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        } else
            {
            try {
                _file.createNewFile();
                IsCompleted = true;
            } catch (IOException e)
            {
                e.printStackTrace();
                _context.Logger.info("IOExeption");
            }
        }
    }

}
