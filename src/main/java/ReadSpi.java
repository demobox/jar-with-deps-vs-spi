import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/*
 * @(#)Read.java     19 Jul 2011
 *
 * Copyright © 2010 Andrew Phillips.
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */

/**
 * @author aphillips
 * @since 19 Jul 2011
 *
 */
public class ReadSpi {

    public static void main(String[] args) throws IOException {
        Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(
                "META-INF/services/MyService.config");
        while (resources.hasMoreElements()) {
            System.out.format("Next: %s%n", resources.nextElement());
        }
    }

}
