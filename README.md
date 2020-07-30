# Double-Click-Listener


<div class="row">
		<div class="col-lg-10">
			<h1 class="page-header" id="howto">How to</h1>
		</div>
	</div>
  
  <div class="row">
		<div class="col-lg-12">
				<p>To get a Git project into your build:</p>
		</div>
	</div>

## Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
  
  <pre class="kode language-css code-toolbar"><code class=" kode language-css">	<span class="token selector">allprojects</span> <span class="token punctuation">{</span>
		<span class="token selector">repositories</span> <span class="token punctuation">{</span>
			<span class="token selector">...
			maven</span> <span class="token punctuation">{</span> url <span class="token string">'https://jitpack.io'</span> <span class="token punctuation">}</span>
		<span class="token punctuation">}</span>
	<span class="token punctuation">}</span></code></pre>
  
  ## Step 2. Add the dependency
  
  <pre class="kode code-toolbar  language-css"><code id="depCodeGradle" class=" kode  language-css">	<span class="token selector">dependencies</span> <span class="token punctuation">{</span>
	        implementation <span class="token string">'com.github.CormacKrum:Double-Click-Listener:Tag'</span>
	<span class="token punctuation">}</span>
</code></pre>


# Basic Usage 


<p>The class <code>DoubleClickListener</code> extends from <code>View.OnClickListener</code> so, just call the <code>DoubleClickListener</code> class on your onClickListener
of the view that you wish to listen, and pass an object of <code>DoubleClickListener.Callback</code> class to listen the events.</p>

* **Kotlin**

<pre><code>    button.setOnClickListener(
        DoubleClickListener(
            callback = object : DoubleClickListener.Callback {
                override fun doubleClicked() {
                
                }
            }
        )
    )
</code></pre>


* **Java**

<pre><code>    button.setOnClickListener(
        DoubleClickListener(
            new DoubleClickListener.Callback {
                override fun doubleClicked() {
                
                }
            }
        )
    )
</code></pre>

<p>Share this release:</p>

[![](https://jitpack.io/v/CormacKrum/Double-Click-Listener.svg)](https://jitpack.io/#CormacKrum/Double-Click-Listener)


