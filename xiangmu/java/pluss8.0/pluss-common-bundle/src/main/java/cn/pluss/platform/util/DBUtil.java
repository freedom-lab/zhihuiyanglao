package cn.pluss.platform.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {

    public static List loadSql(String sqlFile)  throws Exception{
        List sqlList = new ArrayList();
        try {
            FileReader fr = new FileReader(sqlFile);
            BufferedReader br = new BufferedReader(fr);
            String s="";
            StringBuffer sb = new StringBuffer();
            while ((s = br.readLine()) != null) {
                if(s.startsWith("/*")||s.startsWith("--")){
                }
                else if(s.endsWith(";")){
                    sb.append(s);
                    sqlList.add(sb.toString());
                    sb.delete(0, sb.length());
                }
                else{
                    sb.append(s);
                }
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return sqlList;
    }
}
