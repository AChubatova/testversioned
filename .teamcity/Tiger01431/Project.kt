package Tiger01431

import Tiger01431.buildTypes.*
import Tiger01431.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01431")
    name = "Tiger01431"

    vcsRoot(Tiger01431_cVCSroot)

    buildType(Tiger01431_Hi2)
    buildType(Tiger01431_Hi3)
    buildType(Tiger01431_Hi0)
    buildType(Tiger01431_Hi1)
})
