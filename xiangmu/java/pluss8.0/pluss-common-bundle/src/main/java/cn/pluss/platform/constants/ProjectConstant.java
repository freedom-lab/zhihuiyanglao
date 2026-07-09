package cn.pluss.platform.constants;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import cn.pluss.platform.model.vo.Ticket;

/**
 * 项目常量
 */
public final class ProjectConstant {
	/**
	 * 生成代码所在的基础包名称，可根据自己的项目修改（注意：这个配置修改之后需要手工修改src目录项目默认的包路径，使其保持一致，不然会找不到类）
	 **/
	public static final String BASE_PACKAGE = "cn.pluss.platform";
	/**
	 * 生成的Model所在包
	 */
	public static final String MODEL_PACKAGE = BASE_PACKAGE + ".model.entity";
	/**
	 * 生成的Mapper所在包
	 */
	public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".mapper";
	/**
	 * 生成的Service所在包
	 */
	public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";
	/**
	 * 生成的ServiceImpl所在包
	 */
	public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";
	/**
	 * 生成的Controller所在包
	 */
	public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".controller";
	/**
	 * Mapper插件基础接口的完全限定名
	 */
	public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.Mapper";

	public static final int BYTE_BUFFER = 1024;

	public static final int BUFFER_MULTIPLE = 10;
	public static final Integer PAGE_SIZE = 10;

	public static Set<String> METHOD_URL_SET = new HashSet<>();
	public static boolean isPass = false;

	public static String  CODING_TYPE_ALL = "all";

	public static String  CODING_TYPE_INCREMENT = "increment";

	public static Map<String,Ticket> TICKET_STORAGE = new HashMap<String,Ticket>();



	public static class FilePostFix {
		public static final String ZIP_FILE = ".zip";
		public static final String[] IMAGES = { "jpg", "jpeg", "JPG", "JPEG", "gif", "GIF", "bmp", "BMP", "png" };
		public static final String[] ZIP = { "ZIP", "zip", "rar", "RAR" };
		public static final String[] VIDEO = { "mp4", "MP4", "mpg", "mpe", "mpa", "m15", "m1v", "mp2", "rmvb" };
		public static final String[] APK = { "apk", "exe" };
		public static final String[] OFFICE = { "xls", "xlsx", "docx", "doc", "ppt", "pptx" };

	}

	public class FileType {
		public static final int FILE_IMG = 1;
		public static final int FILE_ZIP = 2;
		public static final int FILE_VEDIO = 3;
		public static final int FILE_APK = 4;
		public static final int FIVE_OFFICE = 5;
		public static final String FILE_IMG_DIR = "/img/";
		public static final String FILE_ZIP_DIR = "/zip/";
		public static final String FILE_VEDIO_DIR = "/video/";
		public static final String FILE_APK_DIR = "/apk/";
		public static final String FIVE_OFFICE_DIR = "/office/";
	}
}
