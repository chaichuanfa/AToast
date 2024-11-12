# AToast

[ ![Download](https://api.bintray.com/packages/felix0503/maven/atoast/images/download.svg) ](https://bintray.com/felix0503/maven/atoast/_latestVersion)

统一Toast样式,自定义Error、Info、Success、Warning、Normal样式,扩展loading toast

## ScreenShot

![screenshot][1]

## Usage ##

 - Gradle

    compile 'com.github.chaichuanfa:atoast:0.0.2'
    

An Sample:

    public class App extends Application {
        @Override
        public void onCreate() {
            super.onCreate();
            //需要在Application 的onCreate中初始化
            AToast.onInit(this);
            //自定义toast背景颜色
    //      AToast.onInit(this, new AToastConfig.Builder().error_color(Color.RED).info_color(Color.BLUE)
    //           .normal_color(Color.GRAY).text_color(Color.WHITE).build());
        }
    }
    
    
    AToast.normal("normal");
    AToast.warning("warning");
    AToast.success("success");
    AToast.error("error");
    AToast.info("info");
    
    
    LoadToast lt = AToast.loadToast(this, "loading...");
    lt.show();
    lt.success();
    lt.error();
    


  [1]: https://raw.githubusercontent.com/chaichuanfa/AToast/master/screenshot/ezgif.com-video-to-gif.gif
