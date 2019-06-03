package DAO;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * 
 * @author Group 4
 *
 *
 * class DAOLEvel
 */
public class DAOLevel {
	
 static DBConnection connect= new DBConnection();
 
 private static char[][] scenetest= new char[24][35];
 
 
 public DAOLevel() {
	 DAOLevel.scenetest= this.niveau();
 }
 
 /**
  * this function is used to call the procedure 
  * into the database and loading the contents
  * 
  */
 public  char[][] niveau (){ 
	 String strCurrentline= null;
	 int i=0;
			 try { 
				 final String sql="{call level(1)}";
				 final CallableStatement call= connect.getConnection().prepareCall(sql);
				 call.execute();
				 final ResultSet resultSet= call.getResultSet();
				 while(resultSet.next()) {
					 strCurrentline = resultSet.getString("line");
				//	 System.out.println(strCurrentline);
					 for (int j=0; j<35; j++) {
						 scenetest [i][j]= strCurrentline.charAt(j);
						 System.out.print(scenetest[i][j]);
					 }
					 System.out.println("");
					 i++;
				 }
			    }
			 catch (final SQLException e) {
				 e.printStackTrace();
			 }
	return scenetest;
 }
 public static char[][] getScenetest() {
	 return scenetest;
	
 }
			public void setScenetest(char[][]scenetest){
				this.scenetest= scenetest;
			}
}
