package picture;

import java.io.*;
import java.util.List;
import java.util.Map;

/**
 * Created by peilong.zpl on 2015/8/26.
 */
public class Conf {
    private int num;
    private Map<Integer,List<String>> names;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Map<Integer, List<String>> getNames() {
        return names;
    }

    public void setNames(Map<Integer, List<String>> names) {
        this.names = names;
    }


}
