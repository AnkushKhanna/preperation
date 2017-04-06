package gfg.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EditDistanceTest
{
    @Test
    public void find() throws Exception
    {
        Assert.assertEquals(1, EditDistance.edits("cat", "cut"));
        Assert.assertEquals(3, EditDistance.edits("saturday", "sunday"));
        Assert.assertEquals(1, EditDistance.edits("geek", "gesek"));
        Assert.assertEquals(12, EditDistance.edits("bavvvvvv", "accccccddddd"));
        Assert.assertEquals(78, EditDistance.edits("lrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmcoq", "hnwnkuewhsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqcaceh"));
    }
}
