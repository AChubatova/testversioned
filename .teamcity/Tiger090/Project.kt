package Tiger090

import Tiger090.buildTypes.*
import Tiger090.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger090")
    name = "Tiger090"

    vcsRoot(Tiger090_cVCSroot)

    buildType(Tiger090_Hi1)
    buildType(Tiger090_Hi0)
    buildType(Tiger090_Hi3)
    buildType(Tiger090_Hi2)
})
