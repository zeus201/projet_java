package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.CallableStatement;

public class DAOLevel {
 static DBConnection connect= new DBConnection();
 private static char[][] scenetest= new char[25][37];
 public DAOLevel() {
	 this.scenetest= this.niveau();
 }
 
 private char[][] niveau (){ 
	 String strCurrentline= null;
	// char[][] scenetest = new char [25][37];
	 int j=0;
			 try { 
				 final String sql="{call level()}";
				 final CallableStatement call= (CallableStatement) connect.getConnection().prepareCall(sql);
				 call.execute();
				 final ResultSet resultSet= call.getResultSet();
				 while(resultSet.next()) {
					 strCurrentline = resultSet.getString("line");
					 for (int i=0; i<37; i++) {
						 scenetest [j][i]= strCurrentline.charAt(i);
					 }
					 j++;
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
