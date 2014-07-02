package com.dculverwell.jsonpath.reader;

import com.dculverwell.jsonpath.Configuration;
import com.dculverwell.jsonpath.JsonPath;
import com.dculverwell.jsonpath.Option;
import com.dculverwell.jsonpath.spi.JsonProvider;
import com.dculverwell.jsonpath.spi.JsonProviderFactory;

/**
 * User: kalle
 * Date: 8/29/13
 * Time: 12:09 PM
 */
public class ReadConfigurationTest {

    private static JsonProvider provider = JsonProviderFactory.createProvider();


    //@Test
    public void fluent() {

        Configuration configuration = Configuration.defaultConfiguration();

        Configuration configuration2 = Configuration.builder()
                .jsonProvider(JsonProviderFactory.createProvider())
                .options(Option.THROW_ON_MISSING_PROPERTY).build();

        JsonProvider jsonProvider = JsonProviderFactory.createProvider();

        JsonPath.using(configuration).parse("{}").read("$");
        JsonPath.using(jsonProvider).parse("{}").read("$");

        JsonPath.parse("{}").read("$");
        JsonPath.parse("{}", configuration).read("$");

        JsonPath.using(configuration).parse("{}").read("$");




    }
}
