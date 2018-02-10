package com.ijoic.save_state

import android.os.Bundle

/**
 * Argument source.
 *
 * @author xiao.yl on 2018/2/10.
 * @version 1.0
 */
interface ArgumentSource {
  /**
   * Set arguments
   *
   * @param args arguments
   */
  fun setArguments(args: Bundle?)

  /**
   * Returns arguments
   */
  fun getArguments(): Bundle?
}