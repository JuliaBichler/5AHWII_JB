import java.io.IOException;

public class main {

	public static void Main(String[] args) throws IOException{
		
		Logger.getInstance().changeFile("log1.txt");
		
		Logger.getInstance().setLevel(Logger.LogLevel.Warning);
		Logger.getInstance().Debug("Debug1");
		Logger.getInstance().Info("Info2");
		Logger.getInstance().Warning("Warning3");
		Logger.getInstance().Error("Error4");
		
		
		
		Logger.getInstance().setLevel(Logger.LogLevel.Info);
		Logger.getInstance().Debug("Debug5");
		Logger.getInstance().Info("Info6");
		Logger.getInstance().Warning("Warning7");
		Logger.getInstance().Error("Error8");
		

	}
	
	

}
