package ut.com.bridgelabz;

import org.junit.Test;
import com.bridgelabz.api.MyPluginComponent;
import com.bridgelabz.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}