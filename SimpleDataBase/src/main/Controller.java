package main;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Controller {
	/**
	 * 功能：执行保存
	 * @param list
	 * @throws IOException
	 */
	public void executeSave(List<Object> list) throws IOException{
		String name=list.get(0).getClass().getSimpleName();//获得类名，确定是否数据存在
			SaveAndRead.save(list,name);
	}
	
	/**
	 * 执行读取
	 * @param name
	 * @return
	 * @throws IOException 
	 */
	public <T> T executeRead(String name) throws IOException{
		SaveAndRead.read(name);		
		return null;		
	}
	
	/**
	 * 执行删除
	 */
	public String delete(String name){
		SaveAndRead.delete(name);
		return name;
	}
	
}
