# bundleWriteDemo
android 自动获取intent值，到activity、fragment、viewModle等任意对象中
## 配置
项目下build.gradle添加:  
allprojects {  
	repositories {  
			...  
			maven { url 'https://jitpack.io' }  
		}  
	}    
  
app的下build.gradle添加:  
implementation 'com.github.zhouyinchun6:BundleWrite:9.6'  
implementation 'com.github.zhouyinchun6:bundleWrite-init:1.1'  
kapt 'com.github.zhouyinchun6:bundleWrite-processor:1.0'  
## 使用 ( 支持int、long、float、double、boolean、String、Serializable、Parcelable参数注解；1、属性不能被private修饰；2、kotlin代码还需加@JvmField,否则编译不过)
### 获取intent中的name值
@WriteBundle  
String name;

### 通过设置name = "age",获取intent中的age值
@WriteBundle(name = "age")  
int age2;

### 支持默认值
@WriteBundle  
String address = "默认值"; 

### 自动获取intent值，到activity、fragment、viewModle等任意对象中
BundleInit.inject(this);

## ***注意kotlin代码需加@JvmField注解修饰
### 例如
@JvmField  
@WriteBundle    
String name;

## 合作及使用问题请联系
![](/pic/wx_me.jpeg)




