package brmr.guilds;

public abstract class BaseFileReader {

    public Boolean IsCompleted = false;
    public String Value;
    
    public abstract void Read();
}
