/*
 * Copyright (C) 2017 The Android Open Source Project
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

package com.android.demo.liverpool.util


import com.android.demo.liverpool.api.PlpSearchResponse
import com.android.demo.liverpool.vo.Product


object TestUtil {

    fun createPlpSearch(){

    }

    fun createProducts(count: Int, name: String): List<Product> {
        return (0 until count).map {
            createProduct(
                id = it,
                name = name + it,
            )
        }
    }


    fun createProduct(id: Int, name: String) = Product(
            "11001323 " + id,
            "1100132300",
            name,
            "Soft Line",
             40,
             4.9,
             8499.0,
             8499.0,
            8499.0,
             0.0,
             0.0,
             0.0,
             false,
            "",
            "",
             false,
             false,
            "XBOX SERIES S",
            "Liverpool",
            "XBOX",
            "https://ss423.liverpool.com.mx/sm/1100132300.jpg",
            "https://ss423.liverpool.com.mx/lg/1100132300.jpg",
            "https://ss423.liverpool.com.mx/xl/1100132300.jpg",
            "Not Specified"
    )


}
