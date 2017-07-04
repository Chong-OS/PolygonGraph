package com.chongos.polygongraphsample

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import com.chongos.polygongraph.PolygonGraphView

/**
 * @author ChongOS
 * @since 30-Jun-2017
 */
class MainActivity : AppCompatActivity() {

    private var graph: PolygonGraphView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindView()
        setupView()
    }

    private fun bindView() {
        graph = findViewById(R.id.graph) as PolygonGraphView?
    }

    private fun setupView() {
        val values = listOf(
                PolygonGraphView.ValueHolder(getString(R.string.fit_cognitive), 0.8f, R.color.fitCognitive.toIntColor()),
                PolygonGraphView.ValueHolder(getString(R.string.fit_coping), 0.9f, R.color.fitCoping.toIntColor()),
                PolygonGraphView.ValueHolder(getString(R.string.fit_behavioral), 0.9f, R.color.fitBehavioral.toIntColor()),
                PolygonGraphView.ValueHolder(getString(R.string.fit_positive_psychology), 0.85f, R.color.fitPositivePsychology.toIntColor()),
                PolygonGraphView.ValueHolder(getString(R.string.fit_assertiveness), 0.75f, R.color.fitAssertiveness.toIntColor()),
                PolygonGraphView.ValueHolder(getString(R.string.fit_goal_setting), 0.5f, R.color.fitGoalSetting.toIntColor()))

        val adapter = object : PolygonGraphView.Adapter<PolygonGraphView.ValueHolder>() {

            override fun getSize(): Int = values.size

            override fun onCreateValueHolder(pos: Int): PolygonGraphView.ValueHolder = values[pos]
        }

        graph?.setAdapter(adapter)
    }

    private fun Int.toIntColor(): Int = ContextCompat.getColor(this@MainActivity, this)
}
