package minesweeper

import java.lang.IndexOutOfBoundsException
fun markField(fieldMatrix : MutableList<MutableList<Char>>,i: Int,j: Int): MutableList<MutableList<Char>> {
    for (k in 0..8) {
        try {
            if (fieldMatrix[i][j] == 'X') {

                when (k) {
                    0 -> fieldMatrix[i - 1][j] =
                        if (fieldMatrix[i - 1][j] >= '1' && fieldMatrix[i - 1][j] != 'X' && fieldMatrix[i - 1][j] != '.') fieldMatrix[i - 1][j] + 1 else if (fieldMatrix[i - 1][j] == '.') '1' else 'X'

                    1 -> fieldMatrix[i + 1][j] =
                        if (fieldMatrix[i + 1][j] >= '1' && fieldMatrix[i + 1][j] != 'X' && fieldMatrix[i + 1][j] != '.') fieldMatrix[i + 1][j] + 1 else if (fieldMatrix[i + 1][j] == '.') '1' else 'X'

                    2 -> fieldMatrix[i - 1][j - 1] =
                        if (fieldMatrix[i - 1][j - 1] >= '1' && fieldMatrix[i - 1][j - 1] != 'X' && fieldMatrix[i - 1][j - 1] != '.') fieldMatrix[i - 1][j - 1] + 1 else if (fieldMatrix[i - 1][j - 1] == '.') '1' else 'X'

                    3 -> fieldMatrix[i - 1][j + 1] =
                        if (fieldMatrix[i - 1][j + 1] >= '1' && fieldMatrix[i - 1][j + 1] != 'X' && fieldMatrix[i - 1][j + 1] != '.') fieldMatrix[i - 1][j + 1] + 1 else if (fieldMatrix[i - 1][j + 1] == '.') '1' else 'X'

                    4 -> fieldMatrix[i][j - 1] =
                        if (fieldMatrix[i][j - 1] >= '1' && fieldMatrix[i][j - 1] != 'X' && fieldMatrix[i][j - 1] != '.') fieldMatrix[i][j - 1] + 1 else if (fieldMatrix[i][j - 1] == '.') '1' else 'X'

                    5 -> fieldMatrix[i][j + 1] =
                        if (fieldMatrix[i][j + 1] >= '1' && fieldMatrix[i][j + 1] != 'X' && fieldMatrix[i][j + 1] != '.') fieldMatrix[i][j + 1] + 1 else if (fieldMatrix[i][j + 1] == '.') '1' else 'X'

                    6 -> fieldMatrix[i + 1][j - 1] =
                        if (fieldMatrix[i + 1][j - 1] >= '1' && fieldMatrix[i + 1][j - 1] != 'X' && fieldMatrix[i + 1][j - 1] != '.') fieldMatrix[i + 1][j - 1] + 1 else if (fieldMatrix[i + 1][j - 1] == '.') '1' else 'X'

                    7 -> fieldMatrix[i + 1][j + 1] =
                        if (fieldMatrix[i + 1][j + 1] >= '1' && fieldMatrix[i + 1][j + 1] != 'X' && fieldMatrix[i + 1][j + 1] != '.') fieldMatrix[i + 1][j + 1] + 1 else if (fieldMatrix[i + 1][j + 1] == '.') '1' else 'X'
                }
            }
        } catch (e: IndexOutOfBoundsException) {
            continue
        }
    }

    return fieldMatrix
}

fun markField2(fieldMatrix: MutableList<MutableList<Char>>,mirror: MutableList<MutableList<Char>>,i: Int,j: Int): MutableList<MutableList<Char>>{

    fieldMatrix[i][j]='/'
    for(l in i..9){
        try{
            for(c in j..9){
                if(mirror[l][c]=='.'){
                    fieldMatrix[l][c]='/'
                    for (k in 0..8) {
                        try{
                            when(k) {
                                0 -> fieldMatrix[l - 1][c] = if(mirror[l - 1][c]=='.') '/' else mirror[l - 1][c]
                                1 -> fieldMatrix[l + 1][c] = if(mirror[l + 1][c]=='.') '/' else mirror[l + 1][c]
                                2 -> fieldMatrix[l - 1][c - 1] = if(mirror[l - 1][c - 1]=='.') '/' else mirror[l - 1][c - 1]
                                3 -> fieldMatrix[l - 1][c + 1] = if(mirror[l - 1][c + 1]=='.') '/' else mirror[l - 1][c + 1]
                                4 -> fieldMatrix[l][c - 1] = if(mirror[l][c - 1]=='.') '/' else mirror[l][c - 1]
                                5 -> fieldMatrix[l][c + 1] = if(mirror[l][c + 1]=='.') '/' else mirror[l][c + 1]
                                6 -> fieldMatrix[l + 1][c - 1] = if(mirror[l + 1][c - 1]=='.') '/' else mirror[l + 1][c - 1]
                                7 -> fieldMatrix[l + 1][c + 1] = if(mirror[l + 1][c + 1]=='.') '/' else mirror[l + 1][c + 1]
                            }
                        }catch(e: IndexOutOfBoundsException){
                            continue
                        }
                    }
                }
            }

        }catch(e: IndexOutOfBoundsException){
            continue
        }
    }

    for(l in i..9){
        try{
            for(c in j downTo 0){
                if(mirror[l][c]=='.'){
                    fieldMatrix[l][c]='/'
                    for (k in 0..8) {
                        try{
                            when(k) {
                                0 -> fieldMatrix[l - 1][c] = if(mirror[l - 1][c]=='.') '/' else mirror[l - 1][c]
                                1 -> fieldMatrix[l + 1][c] = if(mirror[l + 1][c]=='.') '/' else mirror[l + 1][c]
                                2 -> fieldMatrix[l - 1][c - 1] = if(mirror[l - 1][c - 1]=='.') '/' else mirror[l - 1][c - 1]
                                3 -> fieldMatrix[l - 1][c + 1] = if(mirror[l - 1][c + 1]=='.') '/' else mirror[l - 1][c + 1]
                                4 -> fieldMatrix[l][c - 1] = if(mirror[l][c - 1]=='.') '/' else mirror[l][c - 1]
                                5 -> fieldMatrix[l][c + 1] = if(mirror[l][c + 1]=='.') '/' else mirror[l][c + 1]
                                6 -> fieldMatrix[l + 1][c - 1] = if(mirror[l + 1][c - 1]=='.') '/' else mirror[l + 1][c - 1]
                                7 -> fieldMatrix[l + 1][c + 1] = if(mirror[l + 1][c + 1]=='.') '/' else mirror[l + 1][c + 1]
                            }
                        }catch(e: IndexOutOfBoundsException){
                            continue
                        }
                    }
                }
            }

        }catch(e: IndexOutOfBoundsException){
            continue
        }
    }

    for(l in i downTo 0){
        try{
            for(c in j..9){
                if(mirror[l][c]=='.'){
                    fieldMatrix[l][c]='/'
                    for (k in 0..8) {
                        try{
                            when(k) {
                                0 -> fieldMatrix[l - 1][c] = if(mirror[l - 1][c]=='.') '/' else mirror[l - 1][c]
                                1 -> fieldMatrix[l + 1][c] = if(mirror[l + 1][c]=='.') '/' else mirror[l + 1][c]
                                2 -> fieldMatrix[l - 1][c - 1] = if(mirror[l - 1][c - 1]=='.') '/' else mirror[l - 1][c - 1]
                                3 -> fieldMatrix[l - 1][c + 1] = if(mirror[l - 1][c + 1]=='.') '/' else mirror[l - 1][c + 1]
                                4 -> fieldMatrix[l][c - 1] = if(mirror[l][c - 1]=='.') '/' else mirror[l][c - 1]
                                5 -> fieldMatrix[l][c + 1] = if(mirror[l][c + 1]=='.') '/' else mirror[l][c + 1]
                                6 -> fieldMatrix[l + 1][c - 1] = if(mirror[l + 1][c - 1]=='.') '/' else mirror[l + 1][c - 1]
                                7 -> fieldMatrix[l + 1][c + 1] = if(mirror[l + 1][c + 1]=='.') '/' else mirror[l + 1][c + 1]
                            }
                        }catch(e: IndexOutOfBoundsException){
                            continue
                        }
                    }
                }
            }

        }catch(e: IndexOutOfBoundsException){
            continue
        }
    }

    for(l in i downTo 0){
        try{
            for(c in j downTo 0){
                if(mirror[l][c]=='.'){
                    fieldMatrix[l][c]='/'
                    for (k in 0..8) {
                        try{
                            when(k) {
                                0 -> fieldMatrix[l - 1][c] = if(mirror[l - 1][c]=='.') '/' else mirror[l - 1][c]
                                1 -> fieldMatrix[l + 1][c] = if(mirror[l + 1][c]=='.') '/' else mirror[l + 1][c]
                                2 -> fieldMatrix[l - 1][c - 1] = if(mirror[l - 1][c - 1]=='.') '/' else mirror[l - 1][c - 1]
                                3 -> fieldMatrix[l - 1][c + 1] = if(mirror[l - 1][c + 1]=='.') '/' else mirror[l - 1][c + 1]
                                4 -> fieldMatrix[l][c - 1] = if(mirror[l][c - 1]=='.') '/' else mirror[l][c - 1]
                                5 -> fieldMatrix[l][c + 1] = if(mirror[l][c + 1]=='.') '/' else mirror[l][c + 1]
                                6 -> fieldMatrix[l + 1][c - 1] = if(mirror[l + 1][c - 1]=='.') '/' else mirror[l + 1][c - 1]
                                7 -> fieldMatrix[l + 1][c + 1] = if(mirror[l + 1][c + 1]=='.') '/' else mirror[l + 1][c + 1]
                            }
                        }catch(e: IndexOutOfBoundsException){
                            continue
                        }
                    }
                }
            }

        }catch(e: IndexOutOfBoundsException){
            continue
        }
    }








    return fieldMatrix

}
fun main() {
    println("How many mines do you want on the field?")
    val mines = readLine()!!.toInt()
    val field = CharArray(9 * 9) {if (it < mines) 'X' else '.'}
    field.shuffle()
    var cont = 0
    var fieldMatrix : MutableList<MutableList<Char>> = mutableListOf()
    var mirror : MutableList<MutableList<Char>> = mutableListOf()
    for(i in 0 until 9) {
        fieldMatrix.add(mutableListOf())
        mirror.add(mutableListOf())
    }

    for(i in field.indices){
        if(i%9==0 && i!=0) ++cont
        fieldMatrix[cont] += field[i]

    }



    for(i in fieldMatrix.indices){
        for(j in fieldMatrix[i].indices){
            fieldMatrix = markField(fieldMatrix,i,j)
        }
    }

    var string = ""
    for(i in fieldMatrix.indices) mirror[i]+=fieldMatrix[i]
    for(i in mirror.indices){
        for(j in mirror[i].indices){
            fieldMatrix[i][j]='.'
        }
        println(mirror[i])
    }


    while(true){
        for(i in fieldMatrix) string+=i.joinToString("")
        println(" │123456789│")
        println("—│—————————│")

        for (i in 0 until 9) println("${i+1}|"+string.slice(i * 9 until (i + 1) * 9)+"|")
        println("—│—————————│")
        string = ""

        println("Set/unset mine marks or claim a cell as free:")
        val (x, y, op) = readln().split(" ")

        var stringField = ""
        var stringMirror = ""

        when(op){
            "free" -> {
                if(mirror[y.toInt()-1][x.toInt()-1]=='.'){
                    fieldMatrix=markField2(fieldMatrix, mirror,y.toInt()-1,x.toInt()-1)


                } else if(mirror[y.toInt()-1][x.toInt()-1]=='X'){
                    for(i in fieldMatrix.indices){
                        for(j in fieldMatrix.indices){
                            if(mirror[i][j]=='X'){
                                fieldMatrix[i][j]='X'
                            }
                        }
                    }
                    for(i in fieldMatrix) string+=i.joinToString("")
                    println(" │123456789│")
                    println("—│—————————│")

                    for (i in 0 until 9) println("${i+1}|"+string.slice(i * 9 until (i + 1) * 9)+"|")
                    println("—│—————————│")

                    println("You stepped on a mine and failed!")
                    break
                }else{
                    fieldMatrix[y.toInt()-1][x.toInt()-1]=mirror[y.toInt()-1][x.toInt()-1]
                }
            }
            "mine" -> fieldMatrix[y.toInt()-1][x.toInt()-1] = if(fieldMatrix[y.toInt()-1][x.toInt()-1]=='.') '*' else '.'
        }

        for(i in fieldMatrix) stringField+=i.map { if(it=='/') '.' else if( it=='*') 'X' else it }.joinToString("")
        for(i in mirror) stringMirror+=i.joinToString("")

        if(stringField == stringMirror){
            println("Congratulations! You found all the mines!")
            break
        }
    }
}
