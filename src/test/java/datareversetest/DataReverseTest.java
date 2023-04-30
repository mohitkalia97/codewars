package datareversetest;


import datareverse.DataReverse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DataReverseTest {

    @Test
    public void test1DataReverser(){
        int[] byteCode = {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,
                1,1,1,0,1,0,1,0,1,0};
        int[] expectedByteCode = {1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0,0,
                0,0,0,0,0,0,1,1,1,1,1,1,1,1};

        assertArrayEquals(expectedByteCode, DataReverse.DataReverser(byteCode));
    }

   @Test
    public void test2DataReverser(){

        int[] byteCode2 = {0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1};
        int[] expectedByteCode = {1,0,0,0,1,0,0,1,0,0,1,1,0,1,1,0};;

        assertArrayEquals(expectedByteCode, DataReverse.DataReverser(byteCode2));
    }
}
