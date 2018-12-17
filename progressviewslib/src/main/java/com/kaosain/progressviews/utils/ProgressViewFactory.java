package com.natasa.progressviews.utils;

import android.content.Context;

import com.natasa.progressviews.ArcProgressBar;
import com.natasa.progressviews.CircleProgressBar;
import com.natasa.progressviews.CircleSegmentBar;
import com.natasa.progressviews.LineProgressBar;

public class ProgressViewFactory {
	private Context context;

	public ProgressViewFactory(Context context) {
		this.context = context;
	}

	public ProgressShape getShape(ShapeType shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equals(ShapeType.ARC)) {
			return new ArcProgressBar(context);

		} else if (shapeType.equals(ShapeType.CIRCLE)) {
			return new CircleProgressBar(context);

		} else if (shapeType.equals(ShapeType.SEGMENT_CIRCLE)) {
			return new CircleSegmentBar(context);

		} else if (shapeType.equals(ShapeType.SEGMENT_CIRCLE)) {
			return new LineProgressBar(context);
		}

		return null;
	}
}
