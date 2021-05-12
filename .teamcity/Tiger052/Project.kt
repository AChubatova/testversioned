package Tiger052

import Tiger052.buildTypes.*
import Tiger052.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger052")
    name = "Tiger052"

    vcsRoot(Tiger052_cVCSroot)

    buildType(Tiger052_Hi2)
    buildType(Tiger052_Hi3)
    buildType(Tiger052_Hi0)
    buildType(Tiger052_Hi1)
})
