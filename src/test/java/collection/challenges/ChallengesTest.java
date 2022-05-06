package collection.challenges;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChallengesTest {

    private Challenges challenges;
    private static final double DELTA = 1e-15;

    @Before
    public void setUp(){
        this.challenges = new Challenges();
    }

    @Test
    public void uniqueValuesTest(){

        int[] nums = {1,2,1,3,4,6,5,6,7,3,4,2,3};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        int[] actual = challenges.uniqueValues(nums);

        Assert.assertTrue(actual!= null);
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void maxFromArrayTest(){
        int[] nums = {1,2,1,3,4,6,5,6,7,3,4,2,3};
        int expected = challenges.maxFromArray(nums);
        int actual = 7;
        Assert.assertEquals(expected, actual);

        nums = new int[]{};
        expected = challenges.maxFromArray(nums);
        actual = -1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void charsOver3Test(){
        List<String > str = new ArrayList<>(List.of("abdfd","dsf","d","dsfasd","fde","dfdfg"));
        List<String> expected = List.of("abdfd", "dsfasd","dfdfg");
        List<String> actual = challenges.charsOver3(str);

        Assert.assertEquals(expected , actual);
    }

    @Test
    public void charsOver3EmptyTest(){
        List<String > str = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        List<String> actual = challenges.charsOver3(str);

        Assert.assertEquals(expected , actual);
    }

    @Test
    public void addTwoListsTest(){
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,1,2,3,1,32,34,2));
        List<Integer> list2 = new ArrayList<>(List.of(9,5,3,1,2,6,1,32,34,2));

        List<Integer> actual = challenges.addTwoLists(list1, list2);

        List<Integer> expected = new ArrayList<>(Arrays.asList(32, 1, 2, 34, 3, 5, 6, 9));

        Assert.assertEquals(expected , actual);
    }

    @Test
    public void repeatAbCountTest(){
        int actual = challenges.repeatAbCount("fdabglksabjfldabdlfja");
        Assert.assertEquals(3, actual);

        actual = challenges.repeatAbCount("");
        Assert.assertEquals(0, actual);

        actual = challenges.repeatAbCount(null);
        Assert.assertEquals(0, actual);

    }

    @Test
    public void bigDiffTest(){
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 3, 5, 6));
        int actual = challenges.bigDiff(list);

        Assert.assertEquals(7, actual);

        list = new ArrayList<>(Arrays.asList(7, 2, 10, 9));
        actual = challenges.bigDiff(list);

        Assert.assertEquals(8, actual);

        list = new ArrayList<>();
        actual = challenges.bigDiff(list);

        Assert.assertEquals(-1, actual);

    }

    @Test
    public void maxAverageTest(){

        double actual = challenges.maxAverage(null, null);

        Assert.assertEquals(0, actual, DELTA);

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3)); //2
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5)); // 4


        actual = challenges.maxAverage(list1, list2);
        Assert.assertEquals(4, actual, DELTA);

    }

    @Test
    public void wordsCountTest(){
        int actual = challenges.wordsCount(List.of("a", "bb", "b", "ab", "dfdf", "dsfasd", "", "dfd","ty"), 2);
        Assert.assertEquals(3, actual);
    }

    @Test
    public void fillArrTest(){
        List<Integer> expected = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
        List<Integer> actual = challenges.fillArr(6);
        Assert.assertEquals(expected, actual);
    }

}
