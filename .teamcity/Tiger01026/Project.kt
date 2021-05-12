package Tiger01026

import Tiger01026.buildTypes.*
import Tiger01026.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01026")
    name = "Tiger01026"

    vcsRoot(Tiger01026_cVCSroot)

    buildType(Tiger01026_Hi1)
    buildType(Tiger01026_Hi0)
    buildType(Tiger01026_Hi3)
    buildType(Tiger01026_Hi2)
})
