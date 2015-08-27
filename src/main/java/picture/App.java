package picture;

import java.awt.*;

/**
 * Created by peilong.zpl on 2015/8/26.
 */
public class App {
    private static Point numPosition= new Point(530,245);
    private static Point pointPosition = new Point(245,1030);
    private static Point effectPosition = new Point(245,1110);
    private static Point namePosition = new Point(225,1216);

    private static Point picPosition = new Point(68,268);

    private static Point logoPosition = new Point(490,650);

    private static Point weChatPosition = new Point(530,1050);

    private static String tmp = "temp.png";
    private static String back = "back.png";
    public static void render(String pic){
        String root=System.getProperty("user.dir");//项目根目录路径
        tmp =root+"/resource/result/"+tmp;
        back = root+"/resource/result/"+back;
        String background = root +"/resource/background.png";
        String logo = root+"/resource/logo.png";
        String weChat = root+"/resource/weChat.png";
        pic = root+"/resource/pic.jpg";
        ImageUtils.scale(pic, tmp, 620, true);//测试OK


        ImageUtils.cut3(tmp, tmp, 620, 648 );//测试OK

        ImageUtils.pressText2("1.2",background,back,"荔枝体", 36, new Color(255,241,0),74,(int)pointPosition.getX(),(int)pointPosition.getY(),0.5f);//测试OK
//
        ImageUtils.pressText2("123456",back,back,"荔枝体", 36, new Color(67,67,67), 28, (int)numPosition.getX(),(int)numPosition.getY(), 0.5f);//测试OK
//
        ImageUtils.pressText2("1.2",back,back,"荔枝体", 36, new Color(255,241,0), 74,(int)effectPosition.getX(),(int)effectPosition.getY(),0.5f);//测试OK

        ImageUtils.pressText2("1.2",back,back,"荔枝体", 36, new Color(255,241,0), 74,(int)namePosition.getX(),(int)namePosition.getY(),0.5f);//测试OK
//
        ImageUtils.pressImage(tmp,back,back,(int)picPosition.getX(),(int)picPosition.getY(),0.5f);//测试OK
        ImageUtils.pressImage(logo,back,back,(int)logoPosition.getX(),(int)logoPosition.getY(),0.5f);//测试OK

        ImageUtils.pressImage(weChat,back,back,(int)weChatPosition.getX(),(int)weChatPosition.getY(),0.5f);//测试OK


    }
    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args) {
        render("d:/test/pic.jpg");

    }
}
