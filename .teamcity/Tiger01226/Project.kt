package Tiger01226

import Tiger01226.buildTypes.*
import Tiger01226.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01226")
    name = "Tiger01226"

    vcsRoot(Tiger01226_cVCSroot)

    buildType(Tiger01226_Hi3)
    buildType(Tiger01226_Hi2)
    buildType(Tiger01226_Hi1)
    buildType(Tiger01226_Hi0)
})
