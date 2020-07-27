@file:Suppress("PackageDirectoryMismatch", "SpellCheckingInspection", "unused")

import org.gradle.api.Incubating

@Incubating
object Square {

    val okHttp3 = OkHttp3
    val retrofit2 = Retrofit2
    val sqlDelight = SqlDelight
    val moshi = Moshi
    val wire = Wire
    val leakCanary = LeakCanary

    const val okio = "com.squareup.okio:okio:_"

    object OkHttp3 {
        private const val artifactPrefix = "com.squareup.okhttp3"
        const val okHttp = "$artifactPrefix:okhttp:_"
        const val loggingInterceptor = "$artifactPrefix:logging-interceptor:_"
        const val mockWebServer = "$artifactPrefix:mockwebserver:_"
    }

    object Retrofit2 {
        private const val artifact = "com.squareup.retrofit2"

        const val retrofit = "$artifact:retrofit:_"
        const val mock = "$artifact:retrofit-mock:_"

        val converter = Converter
        val adapter = Adapter

        object Converter {
            private const val artifact = "${Retrofit2.artifact}:converter"

            const val scalars = "$artifact-scalars:_"

            const val moshi = "$artifact-moshi:_"
            const val gson = "$artifact-gson:_"
            const val jackson = "$artifact-jackson:_"

            const val simpleXml = "$artifact-simplexml:_"
        }

        object Adapter {
            const val retrofitJava8 = "$artifact:adapter-java8:_"
            const val retrofitRxJava1 = "$artifact:adapter-rxjava:_"
            const val retrofitRxJava2 = "$artifact:adapter-rxjava2:_"
        }
    }

    object SqlDelight {
        private const val group = "com.squareup.sqldelight"

        const val gradlePlugin = "$group:gradle-plugin:_"

        val drivers = Drivers

        const val coroutinesExtensions = "$group:coroutines-extensions"

        object Drivers {
            const val android = "$group:android-driver:_"

            const val jdbc = "$group:jdbc-driver:_"
            const val jdbcSqlite = "$group:sqlite-driver:_"

            const val native = "$group:native-driver:_"
        }
    }

    object Moshi {
        private const val group = "com.squareup.moshi"

        const val javaReflect = "$group:moshi:_"
        const val kotlinReflect = "$group:moshi-kotlin:_"
        const val kotlinCodegen = "$group:moshi-kotlin-codegen:_"
    }

    object Wire {
        private const val group = "com.squareup.wire"

        const val runtime = "$group:wire-runtime:_"
    }

    object LeakCanary {
        private const val artifact = "com.squareup.leakcanary"

        const val android = "$artifact:leakcanary-android:_"
        const val androidProcess = "$artifact:leakcanary-android-process:_"

        const val androidInstrumentation = "$artifact:leakcanary-android-instrumentation:_"

        const val plumber = "$artifact:plumber-android:_"

        const val objectWatcher = "$artifact:leakcanary-object-watcher-android:_"

        val shark = Shark

        object Shark {
            private const val artifactPrefix = "$artifact:shark"

            const val hprof = "$artifactPrefix-hprof:_"
            const val graph = "$artifactPrefix-graph:_"
            const val shark = "$artifactPrefix:_"
            const val android = "$artifactPrefix-android:_"
            const val cli = "$artifactPrefix-cli:_"
        }
    }
}
