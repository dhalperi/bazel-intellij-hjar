import com.google.common.collect.ImmutableList;
import net.sf.javabdd.BDD;
import org.apache.commons.lang3.StringUtils;
import org.batfish.datamodel.Ip;

public final class DemoClass {
  BDD bdd;
  ImmutableList list;
  StringUtils utils;

  public static void main(String[] args) {
    Ip ip = Ip.parse("1.2.3.4");
  }
}
