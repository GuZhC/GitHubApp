package com.guzhc.common

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val otherwisey = false.yes {
            1
        }.otherwise {
            2
        }
        Assert.assertEquals(otherwisey,2)

        val resulty = true.yes {
            1
        }.otherwise {
            2
        }
        assertEquals(resulty,1)

        val otherwisen = true.no {
            1
        }.otherwise {
            2
        }
        assertEquals(otherwisen,2)

        val resultn = false.no {
            false
        }.otherwise {
            2
        }
        assertEquals(resultn,false)

        false.no {

        }


    }
}
