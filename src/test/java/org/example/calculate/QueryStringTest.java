package org.example.calculate;

import org.example.QueryStrings;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringTest {

    // operand1 = =1
    @Test
    void createTest(){
        QueryStrings queryStrings = new QueryStrings("operand1=11&operator=*&operand2=55");

        assertThat(queryStrings).isNotNull();

    }

}
