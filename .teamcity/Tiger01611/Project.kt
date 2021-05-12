package Tiger01611

import Tiger01611.buildTypes.*
import Tiger01611.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01611")
    name = "Tiger01611"

    vcsRoot(Tiger01611_cVCSroot)

    buildType(Tiger01611_Hi1)
    buildType(Tiger01611_Hi0)
    buildType(Tiger01611_Hi3)
    buildType(Tiger01611_Hi2)
})
