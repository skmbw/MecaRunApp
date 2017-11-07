package tech.elecholic.mecanum

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import tech.elecholic.mecarun.R


class RockerView: View {

    private var innerColor: Int
    private var outerColor: Int
    private var realWidth = 0f
    private var realHeight = 0f
    private var innerCircleX = 0f
    private var innerCircleY = 0f
    private var outerRadius = 0f
    private var innerRadius = 0f
    private var angle = 0f
    private var outerCircle: Paint
    private var innerCircle: Paint
    private lateinit var mListener: OnAngleChangedListener
    private var OUTER_WIDTH_SIZE: Int
    private var OUTER_HEIGHT_SIZE: Int
    private val INNER_COLOR_DEFAULT = Color.parseColor("#d32f2f")
    private val OUTER_COLOR_DEFAULT = Color.parseColor("#f44336")

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        // Obtain attributes from XML file
        val a = context.obtainStyledAttributes(attrs, R.styleable.RockerView)
        innerColor = a.getColor(R.styleable.RockerView_InnerColor, INNER_COLOR_DEFAULT)
        outerColor = a.getColor(R.styleable.RockerView_OuterColor, OUTER_COLOR_DEFAULT)
        a.recycle()
        // Convert units
        OUTER_WIDTH_SIZE = dip2px(context, 125.0f)
        OUTER_HEIGHT_SIZE = dip2px(context, 125.0f)
        // Prepare to draw circle
        outerCircle = Paint()
        innerCircle = Paint()
        outerCircle.color = outerColor
        outerCircle.style = Paint.Style.FILL_AND_STROKE
        innerCircle.color = innerColor
        innerCircle.style = Paint.Style.FILL_AND_STROKE
    }

}