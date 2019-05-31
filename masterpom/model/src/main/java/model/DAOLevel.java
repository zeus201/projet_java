package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.CallableStatement;

public class DAOLevel {
 static DBConnection connect= new DBConnection();
 private char[][] scenetest= new char[23][50];
 public DAOLevel() {
	 this.scenetest= this.niveau();
 }
 
 private char[][] niveau (){ 
	 String strCurrentline= null;
	 char[][] scenetest = new char [50][23];
	 int j=0;
			 try { 
				 final String sql="{call level1()}";
				 final CallableStatement call= (CallableStatement) connect.getConnection().prepareCall(sql);
				 call.execute();
				 final ResultSet resultSet= call.getResultSet();
				 while(resultSet.next()) {
					 strCurrentline = resultSet.getString("valeur");
					 for (int i=0; i<50; i++) {
						 scenetest [i][j]= strCurrentline.charAt(i);
					 }
					 j++;
				 }
			    }
			 catch (final SQLException e) {
				 e.printStackTrace();
			 }
	return scenetest;
 }
 public char[][] getScenetest() {
	 return scenetest;
	
 }
			public void setScenetest(char[][]scenetest){
				this.scenetest= scenetest;
			}
}
