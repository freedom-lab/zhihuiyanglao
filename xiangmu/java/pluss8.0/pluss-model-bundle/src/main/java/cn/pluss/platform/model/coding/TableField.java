package cn.pluss.platform.model.coding;

import org.springframework.util.StringUtils;

/**
 * 
 * @author liys
 * 2016-4-22 17:35
 *
 */
public class TableField {

	private String fieldName;
	private String fieldType;
	private String fieldComment;
	private String tableName;
	private String schema;
	private String filedUpcaseName;

	public String getFiledUpcaseName() {
		return filedUpcaseName;
	}

	public void setFiledUpcaseName(String filedUpcaseName) {
		this.filedUpcaseName = filedUpcaseName;
	}

	public String getFieldName() {
		//字段首字母小写
		return firstToLowerCase(fieldName);
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getFieldType() {
		return fieldType;
	}
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}
	
	public String getFieldComment() {
		
		//根据空格分隔获取第一个域值
		if(!StringUtils.isEmpty(fieldComment)) {
			fieldComment=fieldComment.split(" ")[0];
		}
		
		return fieldComment;
	}
	public void setFieldComment(String fieldComment) {
		this.fieldComment = fieldComment;
	}

	public TableField() {
	}

	public TableField(String fieldName, String fieldType, String fieldComment) {
		this.fieldName = fieldName;
		this.fieldType = fieldType;
		this.fieldComment = fieldComment;
	}
	
	public String firstToLowerCase(String str) {
		char[] chars = new char[1];
		chars[0] = str.charAt(0);
		String temp = new String(chars);
		if (chars[0] >= 'A' && chars[0] <= 'Z') {
			return str.replaceFirst(temp, temp.toLowerCase());
		}
		return str;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}
}
