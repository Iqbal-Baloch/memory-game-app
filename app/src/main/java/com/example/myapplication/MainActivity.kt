package com.example.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.log

class MainActivity() : AppCompatActivity() {
    var fliped: Boolean = false
    var previous = R.drawable.qus
    var prevId = R.id.one
    var pics = arrayOf(R.drawable.pig,R.drawable.elephant,R.drawable.owl,R.drawable.fish,R.drawable.pig,R.drawable.panda,R.drawable.frog,R.drawable.sheep,R.drawable.elephant,R.drawable.lion,R.drawable.fish,R.drawable.frog,R.drawable.owl,R.drawable.parrot,R.drawable.lion,R.drawable.mouse,R.drawable.sheep,R.drawable.panda,R.drawable.parrot,R.drawable.mouse)
    lateinit var timer: CountDownTimer
    var correctCount: Int = 10
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timer = object: CountDownTimer(100000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                val lblTime: TextView = findViewById(R.id.lblTime)
                lblTime.setText("seconds:  " + millisUntilFinished/1000 )
            }

            override fun onFinish() {
                findViewById<ImageView>(R.id.one).isClickable = false
                findViewById<ImageView>(R.id.two).isClickable = false
                findViewById<ImageView>(R.id.three).isClickable = false
                findViewById<ImageView>(R.id.four).isClickable = false
                findViewById<ImageView>(R.id.five).isClickable = false
                findViewById<ImageView>(R.id.six).isClickable = false
                findViewById<ImageView>(R.id.seven).isClickable = false
                findViewById<ImageView>(R.id.eight).isClickable = false
                findViewById<ImageView>(R.id.nine).isClickable = false
                findViewById<ImageView>(R.id.ten).isClickable = false
                findViewById<ImageView>(R.id.eleven).isClickable = false
                findViewById<ImageView>(R.id.twelve).isClickable = false
                findViewById<ImageView>(R.id.thirteen).isClickable = false
                findViewById<ImageView>(R.id.fourteen).isClickable = false
                findViewById<ImageView>(R.id.fifteen).isClickable = false
                findViewById<ImageView>(R.id.sixteen).isClickable = false
                findViewById<ImageView>(R.id.seventeen).isClickable = false
                findViewById<ImageView>(R.id.eighteen).isClickable = false
                findViewById<ImageView>(R.id.nineteen).isClickable = false
                findViewById<ImageView>(R.id.twenty).isClickable = false
                findViewById<TextView>(R.id.lblTime).setText("You Loss")
            }
        }
        val mp:MediaPlayer = MediaPlayer.create(this, R.raw.backmusic)
        mp.isLooping = true
        correctCount = 10
        mp.start()
        fliped = false
        shuffleElement(pics, 20)
        timer.start()
    }
    fun clicked(view: View){
        val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
        click.start()
        if(view.id == R.id.one){
            val image: ImageView = findViewById(R.id.one)
            image.setImageResource(pics[0])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[0] && prevId != R.id.one ){
                    image2.isClickable = false
                    image.isClickable = false
                    correctCount--
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)

                }
                fliped = false
            }
            else{
                image.setImageResource(pics[0])
                fliped = true
                prevId = R.id.one
                previous = pics[0]
            }

        }
        else if(view.id == R.id.two){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.two)
            image.setImageResource(pics[1])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[1] && prevId != R.id.two ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[1])
                fliped = true
                prevId = R.id.two
                previous = pics[1]
            }
        }
        else if(view.id == R.id.three){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.three)
            image.setImageResource(pics[2])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[2] && prevId != R.id.three ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[2])
                fliped = true
                prevId = R.id.three
                previous = pics[2]
            }
        }
        else if(view.id == R.id.four){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.four)
            image.setImageResource(pics[3])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[3] && prevId != R.id.four ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[3])
                fliped = true
                prevId = R.id.four
                previous = pics[3]
            }

        }
        else if(view.id == R.id.five){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.five)
            image.setImageResource(pics[4])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[4] && prevId != R.id.five ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[4])
                fliped = true
                prevId = R.id.five
                previous = pics[4]
            }
        }
        else if(view.id == R.id.six){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.six)
            image.setImageResource(pics[5])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[5] && prevId != R.id.six ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[5])
                fliped = true
                prevId = R.id.six
                previous = pics[5]
            }
        }
        else if(view.id == R.id.seven){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.seven)
            image.setImageResource(pics[6])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[6] && prevId != R.id.seven ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[6])
                fliped = true
                prevId = R.id.seven
                previous = pics[6]
            }
        }
        else if(view.id == R.id.eight){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.eight)
            image.setImageResource(pics[7])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[7] && prevId != R.id.eight ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[7])
                fliped = true
                prevId = R.id.eight
                previous = pics[7]
            }
        }
        else if(view.id == R.id.nine){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.nine)
            image.setImageResource(pics[8])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[8] && prevId != R.id.nine ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[8])
                fliped = true
                prevId = R.id.nine
                previous = pics[8]
            }
        }
        else if(view.id == R.id.ten){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.ten)
            image.setImageResource(pics[9])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[9] && prevId != R.id.ten ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[9])
                fliped = true
                prevId = R.id.ten
                previous = pics[9]
            }
        }
        else if(view.id == R.id.eleven){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.eleven)
            image.setImageResource(pics[10])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[10] && prevId != R.id.eleven ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[10])
                fliped = true
                prevId = R.id.eleven
                previous = pics[10]
            }
        }
        else if(view.id == R.id.twelve){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.twelve)
            image.setImageResource(pics[11])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[11] && prevId != R.id.twelve ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[11])
                fliped = true
                prevId = R.id.twelve
                previous = pics[11]
            }
        }
        else if(view.id == R.id.thirteen){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.thirteen)
            image.setImageResource(pics[12])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[12] && prevId != R.id.thirteen ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[12])
                fliped = true
                prevId = R.id.thirteen
                previous = pics[12]
            }
        }
        else if(view.id == R.id.fourteen){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.fourteen)
            image.setImageResource(pics[13])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[13] && prevId != R.id.fourteen ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[13])
                fliped = true
                prevId = R.id.fourteen
                previous = pics[13]
            }
        }
        else if(view.id == R.id.fifteen){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.fifteen)
            image.setImageResource(pics[14])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[14] && prevId != R.id.fifteen ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[14])
                fliped = true
                prevId = R.id.fifteen
                previous = pics[14]
            }
        }
        else if(view.id == R.id.sixteen){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.sixteen)
            image.setImageResource(pics[15])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[15] && prevId != R.id.sixteen ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[15])
                fliped = true
                prevId = R.id.sixteen
                previous = pics[15]
            }
        }
        else if(view.id == R.id.seventeen){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.seventeen)
            image.setImageResource(pics[16])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[16] && prevId != R.id.seventeen ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[16])
                fliped = true
                prevId = R.id.seventeen
                previous = pics[16]
            }
        }
        else if(view.id == R.id.eighteen){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.eighteen)
            image.setImageResource(pics[17])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[17] && prevId != R.id.eighteen ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[17])
                fliped = true
                prevId = R.id.eighteen
                previous = pics[17]
            }
        }
        else if(view.id == R.id.nineteen){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.nineteen)
            image.setImageResource(pics[18])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[18] && prevId != R.id.nineteen ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[18])
                fliped = true
                prevId = R.id.nineteen
                previous = pics[18]
            }
        }
        else if(view.id == R.id.twenty){
            val click:MediaPlayer = MediaPlayer.create(this, R.raw.click)
            click.start()
            val image: ImageView = findViewById(R.id.twenty)
            image.setImageResource(pics[19])
            if(fliped){
                val image2: ImageView = findViewById(prevId)
                if (previous == pics[19] && prevId != R.id.twenty ){
                    correctCount--
                    image2.isClickable = false
                    image.isClickable = false
                    val correct:MediaPlayer = MediaPlayer.create(this, R.raw.correct)
                    correct.start()
                }
                else{
                    val incorrect:MediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
                    incorrect.start()
                    Handler().postDelayed({
                        image.setImageResource(R.drawable.qus)
                        image2.setImageResource(R.drawable.qus)
                    }, 500)
                }
                fliped = false
            }
            else{
                image.setImageResource(pics[19])
                fliped = true
                prevId = R.id.twenty
                previous = pics[19]
            }
        }
        if (correctCount == 0){
            findViewById<TextView>(R.id.lblTime).setText("You win")
            timer.cancel()
        }
    }

    fun swapElement(arr: Array < Int > , i: Int, j: Int): Unit
    {
        // Get i location element
        val temp: Int = arr[i];
        // Set new values
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Returns the random location of array elements
    fun randomLocation(min: Int, max: Int): Int
    {
        // Calculate random number between given range
        return min + (Math.random() * (max - min)).toInt();
    }
    // Function which is shuffle given array elements
    fun shuffleElement(arr: Array<Int>, size: Int): Unit
    {
        // (i,j) indicate locations
        var j: Int ;
        var i: Int ;
        // Variable which is controlling the
        // execution process of loop
        var counter: Int = 0;
        // Loop which is shuffling random elements in array
        while (counter < size)
        {
            // Get random location of array index
            i = this.randomLocation(0, size);
            j = this.randomLocation(0, size);
            if (i != j)
            {
                // Swap array elements
                this.swapElement(arr, i, j);
                counter += 1;
            }
        }
    }
}