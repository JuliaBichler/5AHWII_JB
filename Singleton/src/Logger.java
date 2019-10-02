import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

	private PrintWriter writer;
	//private static String filename;
	private static Logger instance;
	private LogLevel level;
	
	public Logger() {}
	
	public enum LogLevel {
	    Debug,
		Info,
		Warning,
		Error,
	}
		
	public static Logger getInstance() {
		if(instance==null) {
			instance=new Logger();}
		return instance;
	}
	
	public void log(LogLevel level, String msg) throws IOException {
        SimpleDateFormat a = new SimpleDateFormat("yyyy.MM.dd - HH:mm:ss ");
        Date currentTime = new Date(); 
        
		writer.println(a.format(currentTime) +"\t\t"+ level +"\t\t" +  msg);
		writer.flush();
	}
	
	public void changeFile(String filename) throws IOException {

		if(writer!=null)
		{
			writer.close();
		}
		try {
			writer = new PrintWriter(new FileWriter(filename,true));
		} 
		catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public void Debug(String msg) throws IOException {
		if(level.ordinal()<1) {
			Logger.getInstance().log(LogLevel.Debug,msg);
		}
	}
	
	public void Info(String msg) throws IOException {
		if(level.ordinal()<2) {
			Logger.getInstance().log(LogLevel.Info,msg);
		}
	}
	
	public void Warning(String msg) throws IOException {
		if(level.ordinal()<3) {
			Logger.getInstance().log(LogLevel.Warning,msg);
		}
	}
	
	public void Error(String msg) throws IOException {
		if(level.ordinal()<4) {
			Logger.getInstance().log(LogLevel.Error,msg);
		}
	}

	public LogLevel getLevel() {
		return level;
	}

	public void setLevel(LogLevel level) {
		this.level = level;
	}
}
