package _05_class._package;

// import 문 사용으로 클래스 사용을 명시.
import _05_class._package.maeil.Choco;
import _05_class._package.seoul.Banana;
public class PackageEx {
    public static void main(String[] args) {

        //1.
        _05_class._package.maeil.Milk m1 = new _05_class._package.maeil.Milk();
        _05_class._package.seoul.Milk m2 = new _05_class._package.seoul.Milk();

        //2.
        Choco c1 = new Choco();
        Banana b1 = new Banana();
    }
}
