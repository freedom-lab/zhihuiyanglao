package cn.pluss.platform.configurer.extend;

import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ToStringSerializer;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.http.MediaType;

import java.nio.charset.Charset;
import java.util.Arrays;

public class FastJsonHttpMessageConverterEx extends FastJsonHttpMessageConverter {
	private static final SerializerFeature[] features = { SerializerFeature.WriteMapNullValue, // 输出空置字段
			SerializerFeature.WriteNullListAsEmpty, // list字段如果为null，输出为[]，而不是null
			// SerializerFeature.WriteNullNumberAsZero, 数值字段如果为null，输出为0，而不是null
			// SerializerFeature.WriteNullBooleanAsFalse,
			// Boolean字段如果为null，输出为false，而不是null
			SerializerFeature.WriteNullStringAsEmpty, // 字符类型字段如果为null，输出为""，而不是null
			SerializerFeature.DisableCircularReferenceDetect // 关闭引用检测，解决$ref问题
	};

	public FastJsonHttpMessageConverterEx() {
		//FastJsonHttpMessageConverter 会导致Long类型前端丢失精度
		//设置long类型到前端时，转String
		SerializeConfig serializeConfig = SerializeConfig.globalInstance;
		serializeConfig.put(Long.class, ToStringSerializer.instance);
		this.getFastJsonConfig().setSerializeConfig(serializeConfig);
		this.getFastJsonConfig().setSerializerFeatures(features);
		super.setDefaultCharset(Charset.forName("UTF-8"));
		super.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON_UTF8));
	}

	@Override
	protected boolean supports(Class<?> clazz) {
		return super.supports(clazz);
	}
}
