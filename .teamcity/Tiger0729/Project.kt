package Tiger0729

import Tiger0729.buildTypes.*
import Tiger0729.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0729")
    name = "Tiger0729"

    vcsRoot(Tiger0729_cVCSroot)

    buildType(Tiger0729_Hi3)
    buildType(Tiger0729_Hi1)
    buildType(Tiger0729_Hi2)
    buildType(Tiger0729_Hi0)
})
