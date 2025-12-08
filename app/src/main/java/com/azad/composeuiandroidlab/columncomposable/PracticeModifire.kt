package com.azad.composeuiandroidlab.columncomposable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

  @Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun LearnBasicModifier1() {
    Column(
        verticalArrangement = Arrangement.spacedBy(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
            .shadow(8.dp, RoundedCornerShape(12.dp))
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .border(2.dp, Color.Black, RoundedCornerShape(12.dp))
            .padding(4.dp)

    ) {
        Text("Hello, Column!")
        Text("Hello, Column!")
        Text("Hello, Column!")
    }
}

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun LearnBasicModifier2() {

}

//🔵 BASIC MODIFIERS (Most Common)
//🧱 Layout & Size
//
//padding()
//
//fillMaxSize()
//
//fillMaxWidth()
//
//fillMaxHeight()
//
//width()
//
//height()
//
//size()
//
//wrapContentSize()
//
//wrapContentWidth()
//
//wrapContentHeight()
//
//🎨 Visual
//
//background()
//
//border()
//
//clip()
//
//✋ Interaction
//
//clickable()
//
//pointerInput()
//
//combinedClickable()
//
//🌑 Visibility
//
//alpha()
//
//offset()
//
//🟢 INTERMEDIATE MODIFIERS (Frequent in real apps)
//🎨 Styling
//
//shadow()
//
//drawBehind()
//
//drawWithContent()
//
//graphicsLayer()
//
//🔧 Layout Control
//
//weight()
//
//aspectRatio()
//
//paddingFromBaseline()
//
//requiredWidth()
//
//requiredHeight()
//
//🔄 Alignment
//
//align()
//
//alignBy()
//
//alignByBaseline()
//
//📌 Shape & clipping variations
//
//clipToBounds()
//
//🎛 Interaction Extensions
//
//scrollable()
//
//verticalScroll()
//
//horizontalScroll()
//
//draggable()
//
//swipeable()
//
//🖱 Pointer & gesture
//
//pointerInteropFilter()
//
//pointerHoverIcon()
//
//mouseClickable()
//
//🔴 ADVANCED MODIFIERS (Need deeper understanding)
//🧵 Low-level Drawing & Graphics
//
//graphicsLayer()
//(scale, rotation, shadow elevation, camera distance, alpha clip, etc.)
//
//drawWithCache()
//
//🧱 Layout Modifiers
//
//layout() → custom layout measurement and placement
//
//onSizeChanged()
//
//onGloballyPositioned()
//
//zIndex()
//
//🎯 Input & Pointer Handling
//
//nestedScroll()
//
//scrollable()
//
//pointerInput { detectDragGestures ... }
//
//awaitPointerEventScope { ... } (inside pointerInput)
//
//🧩 Semantics & Accessibility
//
//semantics()
//
//clearAndSetSemantics()
//
//contentDescription
//
//♿ Focusable & Interaction
//
//focusable()
//
//onFocusChanged()
//
//focusRequester()
//
//focusProperties()
//
//🔒 Touch & hit areas
//
//pointerHoverIcon()
//
//pointerInteropFilter()
//
//🟣 COMPLEX / SPECIALIZED MODIFIERS
//
//(Used in large or advanced UI systems)
//
//🧪 Custom measurable & placement
//
//layoutId() (used in ConstraintLayout, MotionLayout, etc.)
//
//animateContentSize()
//
//animateItemPlacement()
//
//🌀 Animation modifiers
//
//graphicsLayer { rotationX ... }
//
//animateEnterExit()
//
//animateItemPlacement()
//
//🧭 System & Window Insets
//
//statusBarsPadding()
//
//navigationBarsPadding()
//
//imePadding()
//
//windowInsetsPadding()
//
//📜 Scroll & nested scroll
//
//nestedScroll()
//
//scrollable()
//
//overscrollEffect()
//
//pullRefresh() (Accompanist / Material)
//
//🪟 System UI behavior
//
//systemBarsPadding()
//
//windowInsetsPadding(WindowInsets.safeDrawing)
//
//🖼 Draw modifiers
//
//drawWithContent()
//
//drawBehind()