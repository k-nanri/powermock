/*
 * Copyright 2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package samples.junit4.expectnew;

import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import samples.expectnew.ExpectNewDemo;
import samples.newmocking.MyClass;

import java.io.DataInputStream;

/**
 * Test class to demonstrate new instance mocking using expectNew(..).
 * 
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest( { MyClass.class, ExpectNewDemo.class, DataInputStream.class })
public class ExpectNewDemoTest extends ExpectNewCases {

}
