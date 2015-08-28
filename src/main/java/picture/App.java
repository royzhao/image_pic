package picture;

import java.awt.*;
import java.util.*;

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

    private static String tmp = "temp.jpeg";
    private static String back = "back.jpeg";

    public static void render(String pic,double point){
        String root=System.getProperty("user.dir");//项目根目录路径
        tmp =root+"/resource/result/"+tmp;
        back = root+"/resource/result/"+back;
        String background = root +"/resource/background.png";
        String logo = root+"/resource/logo.png";
        String weChat = root+"/resource/weChat.png";
        pic = root+"/resource/pic.jpg";
        ImageUtils.scale(pic, tmp, 620, true);//测试OK

        Conf conf = LoadConf.loadConf();

        ImageUtils.cut3(tmp, tmp, 620, 648 );//测试OK

        ImageUtils.pressText2(""+point,background,back,"荔枝体", 36, new Color(255,241,0),74,(int)pointPosition.getX(),(int)pointPosition.getY(),0.5f);//测试OK
//
        ImageUtils.pressText2(""+conf.getNum(),back,back,"荔枝体", 36, new Color(67,67,67), 28, (int)numPosition.getX(),(int)numPosition.getY(), 0.5f);//测试OK
        conf.setNum(conf.getNum()+1);

        String beya = ""+(int)Math.random()*100000;
        ImageUtils.pressText2(beya,back,back,"荔枝体", 36, new Color(255,241,0), 74,(int)effectPosition.getX(),(int)effectPosition.getY(),0.5f);//测试OK


        Integer mapPoint = (int) point;
        String name = "没有称号哦~";
        java.util.List<String> names = conf.getNames().get(mapPoint);
        if(names != null && names.size()>0){
            int choose = (int)Math.random()*names.size();
            name = names.get(choose);
        }
        ImageUtils.pressText2(name,back,back,"荔枝体", 36, new Color(255,241,0), 74,(int)namePosition.getX(),(int)namePosition.getY(),0.5f);//测试OK
//
        ImageUtils.pressImage(tmp,back,back,(int)picPosition.getX(),(int)picPosition.getY(),0.5f);//测试OK
        ImageUtils.pressImage(logo,back,back,(int)logoPosition.getX(),(int)logoPosition.getY(),0.5f);//测试OK

        ImageUtils.pressImage(weChat,back,back,(int)weChatPosition.getX(),(int)weChatPosition.getY(),0.5f);//测试OK

        LoadConf.writeConf(conf);

    }
    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args) {
        App.render("resource/pic.jpg",1.2);
    }
}
