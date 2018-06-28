import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) {
        Generate gen = new Generate();
        gen.generateDungeon(5,5);


    }

}