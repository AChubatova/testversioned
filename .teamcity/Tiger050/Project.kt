package Tiger050

import Tiger050.buildTypes.*
import Tiger050.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger050")
    name = "Tiger050"

    vcsRoot(Tiger050_cVCSroot)

    buildType(Tiger050_Hi2)
    buildType(Tiger050_Hi3)
    buildType(Tiger050_Hi0)
    buildType(Tiger050_Hi1)

    params {
        param("a", "s")
    }
})
