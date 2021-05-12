package Tiger01248

import Tiger01248.buildTypes.*
import Tiger01248.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01248")
    name = "Tiger01248"

    vcsRoot(Tiger01248_cVCSroot)

    buildType(Tiger01248_Hi3)
    buildType(Tiger01248_Hi2)
    buildType(Tiger01248_Hi1)
    buildType(Tiger01248_Hi0)
})
