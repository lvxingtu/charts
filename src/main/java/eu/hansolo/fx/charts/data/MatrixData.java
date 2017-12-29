/*
 * Copyright (c) 2017 by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.hansolo.fx.charts.data;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;


public interface MatrixData extends Data {

    int            getX();
    void           setX(int x);
    IntegerProperty xProperty();

    int            getY();
    void           setY(int y);
    IntegerProperty yProperty();

    double         getZ();
    void           setZ(double value);
    DoubleProperty zProperty();
}