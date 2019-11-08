package generator.database;

import lombok.Data;

@Data
public class DatabaseField{
    //字段名
    private String name;
    //字段类型
    private String type;
    //字段类型长度
    private String typeLen;
    //备注
    private String comment;
    //是否主键
    private boolean isPrimaryKey;
    //是否外键
    private boolean isForeignKey;
    //是否自增
    private boolean isAutoIncrement;
    //默认值
    private String defaultValue;
    //是否非空
    private  boolean isNull;
}
